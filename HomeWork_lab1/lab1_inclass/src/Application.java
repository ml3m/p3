public class Application {
    private InputDevice inputDevice;
    private OutputDevice outputDevice;

    public Application(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    public void run() {
        playGame();
    }

    public void playGame() {
        int player1Wins = 0;
        int player2Wins = 0;
        int rounds = 0;

        while (player1Wins < 5 && player2Wins < 5) {
            /*
           the strategy to win this game as much as possible, to raise your chances
           is to select a high number like 99 or a prime number thus leaving the other player with less likely chnces of
           chosing the right number that will trigger the win on their side.
             */
            int player1Number = inputDevice.nextInt();
            int player2Number = inputDevice.nextInt();
            rounds++;

            outputDevice.writeMessage("Round " + rounds + ": Player 1 choice: " + player1Number +
                    ", Player 2 choice: " + player2Number);

            if (player1Number == player2Number) {
                player1Wins += 2;
                player2Wins += 2;
                outputDevice.writeMessage("Both players choose the same number. Each gets 2 points.");
            } else {
                int higher = Math.max(player1Number, player2Number);
                int lower = Math.min(player1Number, player2Number);

                if (higher % lower == 0 && lower >= 10) {
                    if (lower == player1Number) {
                        player1Wins++;
                        outputDevice.writeMessage("Player 1 wins the round with " + player1Number +
                                " (multiple of " + player2Number + ")");
                    } else {
                        player2Wins++;
                        outputDevice.writeMessage("Player 2 wins the round with " + player2Number +
                                " (multiple of " + player1Number + ")");
                    }
                } else {
                    if (higher == player1Number) {
                        player1Wins++;
                        outputDevice.writeMessage("Player 1 wins the round with " + player1Number);
                    } else {
                        player2Wins++;
                        outputDevice.writeMessage("Player 2 wins the round with " + player2Number);
                    }
                }
            }

            outputDevice.writeMessage("Score: Player 1 - " + player1Wins + ", Player 2 - " + player2Wins);
        }

        outputDevice.writeMessage("Game over! Winner: " +
                (player1Wins >= 5 ? "Player 1" : "Player 2"));
    }
}