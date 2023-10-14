package davidch.leetcode.challenges.n1348;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TweetCountsTest {

    @Test
    void example_1() {
        final var tweetCounts = new TweetCounts();
        tweetCounts.recordTweet("tweet3", 0);
        tweetCounts.recordTweet("tweet3", 60);
        tweetCounts.recordTweet("tweet3", 10);
        assertThat(tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59)).isEqualTo(List.of(2));
        assertThat(tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60)).isEqualTo(List.of(2, 1));
        tweetCounts.recordTweet("tweet3", 120);
        assertThat(tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 0, 210)).isEqualTo(List.of(4));
    }

    @Test
    void example_2() {
        final var tweetCounts = new TweetCounts();
        tweetCounts.recordTweet("tweet0", 78);
        tweetCounts.recordTweet("tweet1", 7);
        tweetCounts.recordTweet("tweet2", 61);
        tweetCounts.recordTweet("tweet3", 0);
        tweetCounts.recordTweet("tweet4", 20);
        assertThat(tweetCounts.getTweetCountsPerFrequency("minute", "tweet2", 78, 5374)).isEqualTo(List.of(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
    }
}