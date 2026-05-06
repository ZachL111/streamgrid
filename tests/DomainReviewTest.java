package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(77, 46, 11, 90);
        if (DomainReview.score(item) != 257) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("ship")) throw new AssertionError("domain lane mismatch");
    }
}
