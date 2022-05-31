package tictactoe;

    public class Grid {
        private final char[] symbol = {' ', 'O', 'X'};
        private final int[][] grid;
        private int player;
        private int state;

        public Grid() {
            this.grid = new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
            this.player = 1;
            this.update();
        }

        public int state() {
            return this.state;
        }

        public String toString() {
            StringBuilder bString = new StringBuilder("---------\n");
            for(int[] cells : this.grid) {
                bString.append(String.format("| %c %c %c |%n", this.symbol[cells[0]], this.symbol[cells[1]], this.symbol[cells[2]]));
            }
            return bString.append("---------").toString();
        }

        public void makeMove(String coordinates) throws Exception{
            int row, col;
            try {
                String[] numbers = coordinates.trim().split("\\s*[\\s,]\\s*");
                row = Integer.parseInt(numbers[0].trim()) - 1;
                col = Integer.parseInt(numbers[1].trim()) - 1;
            } catch (Exception e) {
                throw new Exception("You should enter numbers!");
            }
            if(row < 0 || row > 2 || col < 0 || col > 2) {
                throw new Exception("Coordinates should be from 1 to 3!");
            }
            if(this.grid[row][col] != 0) {
                throw new Exception("This cell is occupied! Choose another one!");

            }
            grid[row][col] = this.player;
            this.update();
        }

        public void set(String gridPreset) throws Exception {
            gridPreset = gridPreset.toUpperCase();
            if (gridPreset.length() != 9) {
                throw new Exception("Error: Input has wrong size!");
            }
            if (!gridPreset.matches("^[XO_\\s]+$")) {
                throw new Exception("Error: Input has wrong format!");
            }
            int s = 0;
            for(int a = 0; a < gridPreset.length(); a++) {
                this.grid[a / 3][a % 3] = gridPreset.charAt(a) == this.symbol[2] ? 2 : gridPreset.charAt(a) == this.symbol[1] ? 1 : 0;
                s += this.grid[a / 3][a % 3];
            }
            this.player = s % 3 == 0 ? 1 : 2;
            this.update();
        }

        private void update() {
            boolean xWins = false;
            boolean oWins = false;
            int xt, xh, xv, xd1, xd2, ot, oh, ov, od1, od2;
            xt = xd1 = xd2 = ot = od1 = od2 = 0;
            for(int a= 0; a < 3; a++) {
                xt += xh = this.grid[a][0] / 2 + this.grid[a][1] / 2 + this.grid[a][2] / 2;
                xv = this.grid[0][a] / 2 + this.grid[1][a] / 2 + this.grid[2][a] / 2;
                xd1 += this.grid[a][a] / 2;
                xd2 += this.grid[a][2 - a] / 2;
                ot += oh = this.grid[a][0] % 2 + this.grid[a][1] % 2 + this.grid[a][2] % 2;
                ov = this.grid[0][a] % 2 + this.grid[1][a] % 2 + this.grid[2][a] % 2;
                od1 += this.grid[a][a] % 2;
                od2 += this.grid[a][2 - a] % 2;
                xWins |= xh == 3 || xv == 3 || xd1 == 3 || xd2 == 3;
                oWins |= oh == 3 || ov == 3 || od1 == 3 || od2 == 3;
            }
            this.state = Math.abs(xt - ot) > 1 || xWins && oWins ? 4 : oWins ? 3 : xWins ? 2 : xt + ot == 9 ? 1 : 0;
            this.player = this.player % 2 + 1;
        }

    }

