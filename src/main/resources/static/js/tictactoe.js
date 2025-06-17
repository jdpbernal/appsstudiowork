document.addEventListener('DOMContentLoaded', function() {
    const cells = document.querySelectorAll('.cell');
    const status = document.querySelector('.game-status');
    const resetButton = document.querySelector('.reset-button');
    const startButton = document.getElementById('start-button');
    const exitButton = document.getElementById('exit-button');
    const gameBoard = document.querySelector('.game-board');
    const playerXPoints = document.getElementById('player-x-points');
    const playerOPoints = document.getElementById('player-o-points');

    let currentPlayer = 'X';
    let gameState = ['', '', '', '', '', '', '', '', ''];
    let gameActive = false;
    let isSinglePlayerMode = false;
    let pointsX = 0;
    let pointsO = 0;

    // Get the game mode radio buttons
    const gameModeRadios = document.querySelectorAll('input[name="gameMode"]');

    // Add event listeners to the radio buttons
    gameModeRadios.forEach(radio => {
        radio.addEventListener('change', function() {
            isSinglePlayerMode = this.value === 'singlePlayer';
            if (gameActive) {
                resetGame();
            }
        });
    });

    // Initialize game mode based on selected radio button
    isSinglePlayerMode = document.querySelector('input[name="gameMode"]:checked').value === 'singlePlayer';

    // Start button event listener
    startButton.addEventListener('click', function() {
        gameActive = true;
        gameBoard.classList.remove('hidden');
        gameBoard.classList.add('game-board');
        resetButton.classList.remove('hidden');
        startButton.classList.add('hidden');
        resetGame();
    });

    // Exit button event listener
    exitButton.addEventListener('click', function() {
        window.location.href = '/project/games';
    });

    const winningConditions = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8], // rows
        [0, 3, 6], [1, 4, 7], [2, 5, 8], // columns
        [0, 4, 8], [2, 4, 6]             // diagonals
    ];

    // Function to make a computer move
    function makeComputerMove() {
        if (!gameActive) return;

        // Simple AI: First try to win, then block opponent, then take center, then take a random empty cell

        // Check if computer can win
        for (let i = 0; i < 9; i++) {
            if (gameState[i] === '') {
                // Try this move
                gameState[i] = 'O';

                // Check if this move would win
                let roundWon = false;
                for (let j = 0; j < winningConditions.length; j++) {
                    const [a, b, c] = winningConditions[j];
                    if (gameState[a] === 'O' && gameState[b] === 'O' && gameState[c] === 'O') {
                        roundWon = true;
                        break;
                    }
                }

                // Undo the move
                gameState[i] = '';

                if (roundWon) {
                    // Make the winning move
                    gameState[i] = 'O';
                    document.querySelector(`.cell[data-index="${i}"]`).textContent = 'O';
                    checkResult();
                    return;
                }
            }
        }

        // Check if player can win and block
        for (let i = 0; i < 9; i++) {
            if (gameState[i] === '') {
                // Try this move for the player
                gameState[i] = 'X';

                // Check if this move would win for the player
                let playerWouldWin = false;
                for (let j = 0; j < winningConditions.length; j++) {
                    const [a, b, c] = winningConditions[j];
                    if (gameState[a] === 'X' && gameState[b] === 'X' && gameState[c] === 'X') {
                        playerWouldWin = true;
                        break;
                    }
                }

                // Undo the move
                gameState[i] = '';

                if (playerWouldWin) {
                    // Block the player's winning move
                    gameState[i] = 'O';
                    document.querySelector(`.cell[data-index="${i}"]`).textContent = 'O';
                    checkResult();
                    return;
                }
            }
        }

        // Take center if available
        if (gameState[4] === '') {
            gameState[4] = 'O';
            document.querySelector('.cell[data-index="4"]').textContent = 'O';
            checkResult();
            return;
        }

        // Take a random empty cell
        const emptyCells = [];
        for (let i = 0; i < 9; i++) {
            if (gameState[i] === '') {
                emptyCells.push(i);
            }
        }

        if (emptyCells.length > 0) {
            const randomIndex = Math.floor(Math.random() * emptyCells.length);
            const cellIndex = emptyCells[randomIndex];
            gameState[cellIndex] = 'O';
            document.querySelector(`.cell[data-index="${cellIndex}"]`).textContent = 'O';
            checkResult();
        }
    }

    function handleCellClick(clickedCellEvent) {
        // If game is not active, do nothing
        if (!gameActive) {
            return;
        }

        const clickedCell = clickedCellEvent.target;
        const clickedCellIndex = parseInt(clickedCell.getAttribute('data-index'));

        if (gameState[clickedCellIndex] !== '') {
            return;
        }

        // Only allow X moves in single player mode (player is always X)
        if (isSinglePlayerMode && currentPlayer === 'O') {
            return;
        }

        gameState[clickedCellIndex] = currentPlayer;
        clickedCell.textContent = currentPlayer;

        checkResult();
    }

    function checkResult() {
        let roundWon = false;

        for (let i = 0; i < winningConditions.length; i++) {
            const [a, b, c] = winningConditions[i];
            const condition = gameState[a] && gameState[a] === gameState[b] && gameState[a] === gameState[c];

            if (condition) {
                roundWon = true;
                break;
            }
        }

        if (roundWon) {
            // Update points
            if (currentPlayer === 'X') {
                pointsX++;
                playerXPoints.textContent = pointsX;
            } else {
                pointsO++;
                playerOPoints.textContent = pointsO;
            }

            if (isSinglePlayerMode) {
                status.textContent = currentPlayer === 'X' ? 'You win! +1 point' : 'Computer wins! +1 point';
            } else {
                status.textContent = `Player ${currentPlayer} wins! +1 point`;
            }
            gameActive = false;

            // Show start button again
            startButton.classList.remove('hidden');
            startButton.textContent = 'Play Again';
            return;
        }

        const roundDraw = !gameState.includes('');
        if (roundDraw) {
            status.textContent = 'Game ended in a draw!';
            gameActive = false;

            // Show start button again
            startButton.classList.remove('hidden');
            startButton.textContent = 'Play Again';
            return;
        }

        // Switch player
        currentPlayer = currentPlayer === 'X' ? 'O' : 'X';

        // Update status text
        if (isSinglePlayerMode) {
            status.textContent = currentPlayer === 'X' ? 'Your turn' : 'Computer is thinking...';

            // If it's computer's turn in single player mode, make the move
            if (currentPlayer === 'O' && gameActive) {
                // Add a small delay to make it feel more natural
                setTimeout(makeComputerMove, 500);
            }
        } else {
            status.textContent = `Player ${currentPlayer}'s turn`;
        }
    }

    function resetGame() {
        currentPlayer = 'X';
        gameState = ['', '', '', '', '', '', '', '', ''];
        gameActive = true;

        // Set appropriate status text based on game mode
        if (isSinglePlayerMode) {
            status.textContent = 'Your turn';
        } else {
            status.textContent = `Player ${currentPlayer}'s turn`;
        }

        cells.forEach(cell => {
            cell.textContent = '';
        });

        // Hide start button when game is active
        startButton.classList.add('hidden');
        // Show reset button
        resetButton.classList.remove('hidden');
    }

    cells.forEach(cell => {
        cell.addEventListener('click', handleCellClick);
    });

    resetButton.addEventListener('click', resetGame);
});
