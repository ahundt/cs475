package cs475;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ClassifyTest {

	 ////////////////////////////////////////////////
	 // Majority Tests
	
   @Test
   public void trainAndTestBioMajority() throws IOException {
	   System.out.println("\nbioMajority");
Classify.main(new String[] {        "-mode", "train", "-algorithm", "majority", "-model_file", "bioOutputModelMajority", "-data", "./Homework 1 Data/bio/bio.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "bioOutputModelMajority", "-data", "./Homework 1 Data/bio/bio.dev", "-predictions_file", " bioPredictionsMajority"});
}
   @Test
   public void trainAndTestFinanceMajority() throws IOException {
	   System.out.println("\nfinanceMajority");
Classify.main(new String[] {        "-mode", "train", "-algorithm", "majority", "-model_file", "financeOutputModelMajority", "-data", "./Homework 1 Data/finance/finance.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "financeOutputModelMajority", "-data", "./Homework 1 Data/finance/finance.dev", "-predictions_file", " financePredictionsMajority"});
}
   @Test
   public void trainAndTestSpeechMajority() throws IOException {
	   System.out.println("\nspeechMajority");
//echo "**speech data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "majority", "-model_file", "speechOutputModelMajority", "-data", "./Homework 1 Data/speech/speech.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "speechOutputModelMajority", "-data", "./Homework 1 Data/speech/speech.dev", "-predictions_file", " speechPredictionsMajority"});
}
   @Test
   public void trainAndTestSyntheticEasyMajority() throws IOException {
	   System.out.println("\nsyntheticEasyMajority");
//echo "**synthetic easy data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "majority", "-model_file", "syntheticEasyOutputModelMajority", "-data", "./Homework 1 Data/synthetic/easy.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "syntheticEasyOutputModelMajority", "-data", "./Homework 1 Data/synthetic/easy.dev", "-predictions_file", " syntheticEasyMajority"});
}
   @Test
   public void trainAndTestSyntheticHardMajority() throws IOException {
	   System.out.println("\nsyntheticHardMajority");
//echo "**synthetic hard data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "majority", "-model_file", "syntheticHardOutputModelMajority", "-data", "./Homework 1 Data/synthetic/hard.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "syntheticHardOutputModelMajority", "-data", "./Homework 1 Data/synthetic/hard.dev", "-predictions_file", " syntheticHardMajority"});
}
   @Test
   public void trainAndTestVisionMajority() throws IOException {
	   System.out.println("\nvisionMajority");
//echo "**vision data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "majority", "-model_file", "visionOutputModelMajority", "-data", "./Homework 1 Data/vision/vision.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "visionOutputModelMajority", "-data", "./Homework 1 Data/vision/vision.dev", "-predictions_file", " visionMajority"});
   }
   
@Test
public void trainAndTestNLPMajority() throws IOException {
	   System.out.println("\nnlpMajority");
//echo "**nlp data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "majority", "-model_file", "nlpOutputModelMajority", "-data", "./Homework 1 Data/nlp/nlp.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "nlpOutputModelMajority", "-data", "./Homework 1 Data/nlp/nlp.dev", "-predictions_file", " nlpMajority"});

}
   
////////////////////////////////////////////////
// Even Odd Tests
   
   @Test
   public void trainAndTestBioEvenOdd() throws IOException {
	   System.out.println("\nbioEvenOdd");
//echo "using even"-odd model"
//echo "**bio data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "even_odd", "-model_file", "bioOutputModelEvenOdd", "-data", "./Homework 1 Data/bio/bio.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "bioOutputModelEvenOdd", "-data", "./Homework 1 Data/bio/bio.dev", "-predictions_file", " bioPredictionsEvenOdd"});
}
   @Test
   public void trainAndTestFinanceEvenOdd() throws IOException {
	   System.out.println("\nfinanceEvenOdd");
//echo "**finance data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "even_odd", "-model_file", "financeOutputModelEvenOdd", "-data", "./Homework 1 Data/finance/finance.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "financeOutputModelEvenOdd", "-data", "./Homework 1 Data/finance/finance.dev", "-predictions_file", " financePredictionsEvenOdd"});
}
   @Test
   public void trainAndTestSpeechEvenOdd() throws IOException {
	   System.out.println("\nspeechEvenOdd");
//echo "**speech data**"
Classify.main(new String[] {            "-mode", "train", "-algorithm", "even_odd", "-model_file", "speechOutputModelEvenOdd", "-data", "./Homework 1 Data/speech/speech.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "speechOutputModelEvenOdd", "-data", "./Homework 1 Data/speech/speech.dev", "-predictions_file", " speechPredictionsEvenOdd"});
}
   @Test
   public void trainAndTestSyntheticEasyEvenOdd() throws IOException {
	   System.out.println("\nsyntheticEasyEvenOdd");
//echo "**synthetic easy data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "even_odd", "-model_file", "syntheticEasyOutputModelEvenOdd", "-data", "./Homework 1 Data/synthetic/easy.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "syntheticEasyOutputModelEvenOdd", "-data", "./Homework 1 Data/synthetic/easy.dev", "-predictions_file", " syntheticEasyEvenOdd"});
}
   @Test
   public void trainAndTestSyntheticHardEvenOdd() throws IOException {
	   System.out.println("\nsyntheticHardEvenOdd");
//echo "**synthetic hard data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "even_odd", "-model_file", "syntheticHardOutputModelEvenOdd", "-data", "./Homework 1 Data/synthetic/hard.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "syntheticHardOutputModelEvenOdd", "-data", "./Homework 1 Data/synthetic/hard.dev", "-predictions_file", " syntheticHardEvenOdd"});
}
   @Test
   public void trainAndTestVisionEvenOdd() throws IOException {
	   System.out.println("\nvisionEvenOdd");
//echo "**vision data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "even_odd", "-model_file", "visionOutputModelEvenOdd", "-data", "./Homework 1 Data/vision/vision.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "visionOutputModelEvenOdd", "-data", "./Homework 1 Data/vision/vision.dev", "-predictions_file", " visionEvenOdd"});
}
   @Test
   public void trainAndTestNLPEvenOdd() throws IOException {
	   System.out.println("\nnlpEvenOdd");
//echo "**nlp data**"
Classify.main(new String[] {        "-mode", "train", "-algorithm", "even_odd", "-model_file", "nlpOutputModelEvenOdd", "-data", "./Homework 1 Data/nlp/nlp.train"});
Classify.main(new String[] {        "-mode", "test", "-model_file", "nlpOutputModelEvenOdd", "-data", "./Homework 1 Data/nlp/nlp.dev", "-predictions_file", " nlpEvenOdd"});
}
    
}