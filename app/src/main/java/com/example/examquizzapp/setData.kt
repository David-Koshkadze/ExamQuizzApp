package com.example.examquizzapp

object setData {
    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var quest:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "What is capital of Georgia?",

           "Samtredia",
           "Khashuri",
           "Tbilisi",
           "Batumi",
           3
       )
       var question2 = QuestionData(
           2,
           "Which year did the Battle of Didgori was happened?",

           "1121",
           "1200",
           "1795",
           "2008",
           1
       )
       var question3 = QuestionData(
           3,
           "Who wrote Georgian National anthem",

           "Viktor Dolidze",
           "Ioseb Ketchakhmadze",
           "Anri Joxadze",
           "Merab Kashia",
           2
       )
       var question4 = QuestionData(
           4,
           "Who was the first President of Georiga",

           "Mikheil Saakashvili",
           "Giorgi Margvelashvili",
           "Zviad Gamsakhurdia",
           "Edward Shevardnadze",
           3
       )

       var question5 = QuestionData(
           5,
           "Ra qulas mivigebt gamocdaze?",

           "40",
           "40",
           "41",
           "40",
           4
       )

       quest.add(question1)
       quest.add(question2)
       quest.add(question3)
       quest.add(question4)
       quest.add(question5)
       return quest
   }
}