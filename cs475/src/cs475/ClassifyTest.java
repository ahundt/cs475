package cs475;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ClassifyTest {
    @Test
    public void trainAndTestBio() throws IOException {
        Classify.main(new String[] {
            "-mode",       "train",
            "-algorithm",  "majority",
            "-model_file", "outputModelEvenOdd",
            "-data",       "Homework 1 Data/bio/bio.train"
        });
        Classify.main(new String[] {
            "-mode",             "test",
            "-model_file",       "outputModelEvenOdd",
            "-data",             "Homework 1 Data/bio/bio.dev",
            "-predictions_file", "bioPredictionsEvenOdd"
        });
    }
    @Test
    public void trainAndTestFinance() {
        // code here
    }
}