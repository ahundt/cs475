package cs475;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class BernoulliLikelihoodTest {

@Test
public void coinFlipTest() throws IOException {

// echo "running coinflippies"
BernoulliLikelihood.main(new String[] {"-data", "./Homework 1 Data/coin_flip_1"});
BernoulliLikelihood.main(new String[] {"-data", "./Homework 1 Data/coin_flip_2"});
BernoulliLikelihood.main(new String[] {"-data", "./Homework 1 Data/coin_flip_3"});

}
}
