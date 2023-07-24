package com.example.govtquizzer;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private  static List<QuestionsList> gkQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("Where is National Human Museum situated?","Guwahati","Bastar","Bhopal","Chennai","Bhopal","");
        final QuestionsList question2 = new QuestionsList("The first war of Independence 1857 started from?","Lucknow","Jhansi","Meerut","Kanpur","Meerut","");
        final QuestionsList question3 = new QuestionsList("Where is the Taklamakan desert situated?","China", "South Africa","North Africa","Austrelia","China","");
        final QuestionsList question4 = new QuestionsList("Which of the following is brightest star in the sky?","North Star","Canopus","Sirius","Pollux","Sirius","");
        final QuestionsList question5 = new QuestionsList("Chloroquine is used to treat which disease?","Malaria","Cancer","Dengue","Chorona Fever","Malaria","");
        final QuestionsList question6 = new QuestionsList("Who founded the Newspaper 'Al-Hilal'?","Dadabhai Naoroji","Moulana Abul kalam Azad","Mohd. Iqbal","Mohd. Jinnha","Moulana Abul kalam Azad","");
        final QuestionsList question7 = new QuestionsList("Who founded the Pala Kingdom in East India?","Gopala","Krishna","Vikramditya","Mihira Bhoja","Gopala","");
        final QuestionsList question8 = new QuestionsList("Who build the Konark Sun Temple?","Narasimhadeva 1","Kapilendra Deva","Purushottam Deva","Anantavarman Chodaganga Deva","Narasimhadeva 1","");
        final QuestionsList question9 = new QuestionsList("The Agra fort was built by _____ ","Shah Jahan","Akbar","Jahangir","Babar","Akbar","");
        final QuestionsList question10 = new QuestionsList("The tax collected by Marathas was known as ","Chauth","Pilgrim Tax","Jazia","Charai","Chauth","");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);




        return questionsLists;

    }

    private  static List<QuestionsList> reasoningQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("Find the missing term in the given series: U32,V29, ? ,X23,Y20","V17","Z17","W26","Z26","W26","");
        final QuestionsList question2 = new QuestionsList("Complete the following Series: 9,196,25,169,49,144,81,___","121","100","64","34","121","");
        final QuestionsList question3 = new QuestionsList("Information:Encyclopedia :: Equipment:?","Constitution","Factory","Economy","Country","Factory","");
        final QuestionsList question4 = new QuestionsList("Choose the different word :","Scruffy","Dapper","Dashing","Elegant","Scruffy","");
        final QuestionsList question5 = new QuestionsList("Meenu introduces Manish as the only son of his father's father. How Meenu related to Manish?","Mother","Sister","Daughter","Brother","Daughter","");
        final QuestionsList question6 = new QuestionsList("'Zoology' is related to animals in the same way 'Crainology' is related to ____","Fishes","Shells","Algae","Skull","Skull","");
        final QuestionsList question7 = new QuestionsList("JMKP:QNPK :: HTQR:?","SHKO","SGJI","TGJI","THKI","SGJI","");
        final QuestionsList question8 = new QuestionsList("Select the Odd Word Pair","Eagle:Bird","Crocodile:Reptile","Spider:Amphibian","Frog:Amphibian","Spider:Amphibian","");
        final QuestionsList question9 = new QuestionsList("Interchanged to make correct equation 4+2/3*8-1=6","3 and 4","2 and 4","8 and 4","3 and 8","3 and 4","");
        final QuestionsList question10 = new QuestionsList("Complete the series : 10,15,26,35,?","49","48","50","47","50","");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;

    }

    private static List<QuestionsList> englishQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("State the Meaning: To regard with disgust and hatred","tease","abhor","ridicule","sneer","abhor","");
        final QuestionsList question2 = new QuestionsList("Synonyms:INTELLECT","Scholar","Imbecility","Insanity","reverie","Scholar","");
        final QuestionsList question3 = new QuestionsList("Direct/Indirect Speech : He said,'I have done my job.'","He said that he has done his job","He said that he have done his job","He said that he had done his job","He said that he had been done his job","He said that he had done his job","");
        final QuestionsList question4 = new QuestionsList("Synonyms: MIRTH","Reluctant","Indecent","Reputation","Meriment","Meriment","");
        final QuestionsList question5 = new QuestionsList("Antonyms: IMPERTINENT","Insolent","Impudent","Cheeky","Courteous","Courteous","");
        final QuestionsList question6 = new QuestionsList("OWS: A writing or a speech in praise of someone","Etymology","Eulogy","Bibilophile","Honararium","Eulogy","");
        final QuestionsList question7 = new QuestionsList("Select the corectly spelt word","Examplary","Exemplary","Examplery","Exemplery","Exemplary","");
        final QuestionsList question8 = new QuestionsList("OWS: A man who is recovering from illness","dilettante","emeritus","convalescent","bohemian","convalescent","");
        final QuestionsList question9 = new QuestionsList("FIB: It is hoped that a _______ will be reached in the meeting","statement","comparison","compromise","compression","compromise","");
        final QuestionsList question10 = new QuestionsList("Select the error: The victim tried to tell us what has happened but his word were not audible","The victim","has happened","his words","no error","has happened","");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return questionsLists;
    }

    private static List<QuestionsList> mathsQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create a object of question list and pass equations along with options & answers
        final QuestionsList question1 = new QuestionsList("56% of 4356 = 76% of 564 + ?","1789","2100","2500","2011","2011","");
        final QuestionsList question2 = new QuestionsList("(4/9)of(3/7)of(11/5)of 1211=?","610","456","508","580","508","");
        final QuestionsList question3 = new QuestionsList("When an article is sold at its marked price, it gives a profit of 50%. If discount given on an article is 9.6% then find profit percentage.","33.3%","36.6%","35.6%","43.3%","35.6%","");
        final QuestionsList question4 = new QuestionsList("Income ratio of A:B is 1:4 and their expenditure ratio is 2:5. If A saves Rs.5000 & B saves Rs.35000 find Income of A","60000","45000","15000","None of these","15000","");
        final QuestionsList question5 = new QuestionsList("If a dining table with marked price Rs.6000 was sold to a customer for Rs.5520 then the rate of discount allowed on the marked price of the table is:","76%","5%","8%","6%","8%","");
        final QuestionsList question6 = new QuestionsList("The ratio of the radius of the base of two cylinders are in the ratio 2:3 and their heights are in the ratio 5:3, The ratio of their volumes is","27:20","20:27","9:4","4:9","20:27","");
        final QuestionsList question7 = new QuestionsList("If the sum of the two numbers is 120 and their quotient is 5 then the difference of the two number is","115","100","80","72","80","");
        final QuestionsList question8 = new QuestionsList("498 is 17% less than a number then the number is","610","580","600","620","600","");
        final QuestionsList question9 = new QuestionsList("A single discount equivalent to the successive discounts of 10%, 20%, and 25% is","55%","45%","46%","60%","46%","");
        final QuestionsList question10 = new QuestionsList("The average of 6 numbers is 20. If one number is removed, the average becomes 15.What is the number removed ?","5","45","40","25","45","");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "gk":
                return gkQuestions();
            case "reasoning":
                return reasoningQuestions();
            case "english":
                return englishQuestions();
            default:
                return mathsQuestions();
        }
    }
}
