package eu.tutorials.darksouls3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity(), View.OnClickListener
{
    private var bossList: ArrayList<Boss>? = null
    private var currentPos: Int = 0
    private var selectedAnswer: View? = null
    private var numOfCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        bossList = Constants.getQuestions()

        progressBar.max = bossList!!.size
        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)

        setBoss(currentPos)
    }

    private fun reset()
    {
        selectedAnswer = null

        optionOne.setBackgroundResource(R.drawable.btn_background)
        optionTwo.setBackgroundResource(R.drawable.btn_background)
        optionThree.setBackgroundResource(R.drawable.btn_background)
    }

    private fun setBoss(position: Int)
    {
        reset()

        tv_bossName.text = "How do you beat ${bossList!![position].bossName}?"
        iv_bossImage.setImageResource(bossList!![position].bossImage)
        progressBar.progress = position + 1

        tv_progress.text = "${position + 1}/${bossList!!.size}"
        optionOne.text = bossList!![position].optionOne
        optionTwo.text = bossList!![position].optionTwo
        optionThree.text = bossList!![position].optionThree
        btn_submit.text = "SUBMIT"
    }

    override fun onClick(view: View?)
    {
        reset()

        selectedAnswer = view
        view!!.setBackgroundResource(R.drawable.btn_selected_background)
    }

    fun submit(view: View)
    {
        if(btn_submit.text == "SUBMIT")
        {
            checkAnswer(selectedAnswer)
        }
        else
        {
            if(currentPos < (bossList!!.size - 1))
            {
                setBoss(++currentPos)
            }
            else
            {
                val intent = Intent(this, ResultsActivity::class.java)
                intent.putExtra(Constants.RESULTS, numOfCorrectAnswers)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun checkAnswer(view: View?)
    {
        when(view)
        {
            optionOne ->
            {
                if(optionOne.text == bossList!![currentPos].answer)
                {
                    optionOne.setBackgroundResource(R.drawable.btn_correct_background)
                    numOfCorrectAnswers++
                }
                else
                {
                    optionOne.setBackgroundResource(R.drawable.btn_incorrect_background)
                }
            }
            optionTwo ->
            {
                if(optionTwo.text == bossList!![currentPos].answer)
                {
                    optionTwo.setBackgroundResource(R.drawable.btn_correct_background)
                    numOfCorrectAnswers++
                }
                else
                {
                    optionTwo.setBackgroundResource(R.drawable.btn_incorrect_background)
                }
            }
            optionThree ->
            {
                if(optionThree.text == bossList!![currentPos].answer)
                {
                    optionThree.setBackgroundResource(R.drawable.btn_correct_background)
                    numOfCorrectAnswers++
                }
                else
                {
                    optionThree.setBackgroundResource(R.drawable.btn_incorrect_background)
                }
            }
            else -> Toast.makeText(this, "Select an answer please", Toast.LENGTH_SHORT).show()
        }

        if(selectedAnswer != null)
        {
            btn_submit.text = "NEXT QUESTION"
        }
    }

}