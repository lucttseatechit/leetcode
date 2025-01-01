package org.example.jan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MaximumScoreAfterSplittingAStringTest {
    private MaximumScoreAfterSplittingAString1442 score;

    @BeforeEach
    public void setUp() {
        score = new MaximumScoreAfterSplittingAString1442();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/MaximumScoreAfterSplittingAStringData.csv",numLinesToSkip = 0)
    public void testMaximumScoreAfterSplittingAString(String input, int expectedScore) {
        int val=score.maxScore(input);
        Assertions.assertEquals(expectedScore, val);
    }
}
