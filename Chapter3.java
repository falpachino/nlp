public class Chapter3 {

    private static String paragraph = "When determining the end of sentences "
            + "we need to consider several factors. Sentences may end with "
            + "exclamation marks! Or possibly questions marks? Within "
            + "sentences we may find numbers like 3.14159, abbreviations "
            + "such as found in Mr. Smith, and possibly ellipses either "
            + "within a sentence …, or at the end of a sentence….";

    public static void main(String[] args) {
        System.out.println("\n-=usingRegularExpressions\n");
        UsingRegularExpressions.process(paragraph);

        System.out.println("\n\n-=usingBreakIterator");
        UsingBreakIterator.process(paragraph);

        System.out.println("\n \n-=usingOpenNLP");
        UsingOpenNLP.process(paragraph, "/path/to/opennlp/models");

        System.out.println("\n-=usingStanfordPipeline");
        UsingStanfordPipeline.process(paragraph);

        System.out.println("\n-=useLingPipeExamples");
        UseLingPipeExamples.process(paragraph);
    }
}
