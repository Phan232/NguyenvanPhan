package B2;

public class Embosser {

    private char currentPosition;

    public Embosser() {
        this.currentPosition = 'a';
    }

    public int calculateRotations(String text) {
        int totalRotations = 0;

        for (int i = 0; i < text.length(); i++) {
            char target = text.charAt(i);
            totalRotations += calculateMinRotation(currentPosition, target);
            currentPosition = target;
        }

        return totalRotations;
    }

    private int calculateMinRotation(char current, char target) {
        int clockwiseDistance = Math.abs(target - current);
        int counterClockwiseDistance = 26 - clockwiseDistance;
        return Math.min(clockwiseDistance, counterClockwiseDistance);
    }

}
