package com.example.quiz_app

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS:String="correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Predict the output and find the last most element that printed in the loop?",
            R.drawable.ques1,
            "10000",
            "9801",
            "1000",
            "error",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Predict the output",
            R.drawable.ques2,
            "1" +
                    "  1 2" +
                    "  1 2 3" +
                    "  1 2 3 4 " +
                    "  1 2 3 4 5  ",
            "error",
            "1  1 2  1 2 3 ",
            "1 12 123 1234",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Predict the output",
            R.drawable.ques3,
            "No output",
            "Run time error",
            "Hello",
            "Hello, World!",
            4
        )
        questionsList.add(que3)
        val que4 = Question(
                4,
                "Predict the output and assume a=16",
                R.drawable.ques4,
                "Run time error",
                "No output",
                "16 is Even number",
                "16 is ODD number",
                3
        )
        questionsList.add(que4)
        val que5 = Question(
                5,
                "Predict the output assume the year is 2022",
                R.drawable.ques5,
                "No output",
                "2022 is not a leap year",
                "2022 is a leap year",
                "error",
                2
        )
        questionsList.add(que5)
        val que6 = Question(
                6,
                "Predict the output",
                R.drawable.ques6,
                "Num1 is greater 8",
                "Num2 is greater 5",
                "Num1 is greater 5",
                "Num2 is greater 8",
                1
        )
        questionsList.add(que6)
        val que7 = Question(
                7,
                "Predict the output assume the radius is 85",
                R.drawable.ques7,
                "527.0",
                "577.7",
                "527.5",
                "533.8",
                4
        )
        questionsList.add(que7)
        val que8 = Question(
                8,
                "Predict the output",
                R.drawable.ques8,
                "13",
                "No output",
                "11",
                "throws an exception",
                1
        )
        questionsList.add(que8)
        val que9 = Question(
                9,
                "Predict the output",
                R.drawable.ques9,
                "15-7716",
                "No output",
                "78-7616",
                "error",
                4
        )
        questionsList.add(que9)
        val que10 = Question(
                10,
                "Type of Inheritance used in the below image?",
                R.drawable.ques10,
                "Singel level inheritence",
                "Multilevel inheritence",
                "Hierarchical inheritence",
                "Multiple inheritence",
                3
        )
        questionsList.add(que10)





        return questionsList
    }

}
