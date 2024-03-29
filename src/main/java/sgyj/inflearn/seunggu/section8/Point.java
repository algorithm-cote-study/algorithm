package sgyj.inflearn.seunggu.section8;

public class Point {

        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Point of(int x, int y) {
            return new Point(x, y);
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

    }
