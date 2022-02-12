class TwelveDays {
    String []days={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    String []phrases=
    {"a Partridge in a Pear Tree",
    "two Turtle Doves",
    "three French Hens",
    "four Calling Birds",
    "five Gold Rings",
    "six Geese-a-Laying",
    "seven Swans-a-Swimming",
    "eight Maids-a-Milking",
    "nine Ladies Dancing",
    "ten Lords-a-Leaping",
    "eleven Pipers Piping",
    "twelve Drummers Drumming"};
    String mainPhrasePartOne="On the ";
    String mainPhrasePartTwo=" day of Christmas my true love gave to me: ";
    String verse(int verseNumber) {
        StringBuilder str=new StringBuilder();
        str.append(mainPhrasePartOne);
        str.append(days[verseNumber-1]);
        str.append(mainPhrasePartTwo);
        for(int i=verseNumber;i>0;i--)
            {
                str.append(phrases[i-1]);
                if(i!=1)
                    str.append(", ");
                if(i==2)
                    str.append("and ");
            }
        str.append(".\n");
        return str.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder str=new StringBuilder();
        for(int i=startVerse;i<=endVerse;i++)
            {
                str.append(verse(i));
                if(i!=endVerse)
                    str.append("\n");   
            }
            return str.toString();
    }
    
    String sing() {
       return verses(1,12);
    }
}
