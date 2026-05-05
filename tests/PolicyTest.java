package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(69, 89, 8, 9, 5);
        if (Policy.score(signalcase_1) != 195) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(91, 79, 11, 6, 6);
        if (Policy.score(signalcase_2) != 239) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(95, 93, 23, 13, 10);
        if (Policy.score(signalcase_3) != 225) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("accept")) throw new AssertionError("decision mismatch");
    }
}
