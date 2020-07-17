package com.example.myfunction

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var text = editText.text.toString()
    // string->int
    val num = Integer.parseInt(this.text)
    var a: String = " "
    var list = mutableListOf<String>()
    var b: Long = 0L
    var c: Long = 1L
    var d: Double = 1.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button0.setOnClickListener{
            editText.text(editText.getText().contains("0"))
            a= editText.getText().toString()
        }
        button1.setOnClickListener{
            editText.text(editText.getText().contains("1")).toString()
            a= editText.getText().toString()
        }
        button2.setOnClickListener{
            editText.text(editText.getText().contains("2")).toString()
            a= editText.getText().toString()
        }
        button3.setOnClickListener{
            editText.text(editText.getText().contains("3")).toString()
            a= editText.getText().toString()
        }
        button4.setOnClickListener{
            editText.text(editText.getText().contains("4")).toString()
            a= editText.getText().toString()
        }
        button5.setOnClickListener{
            editText.text(editText.getText().contains("5")).toString()
            a= editText.getText().toString()
        }
        button6.setOnClickListener{
            editText.text(editText.getText().contains("6")).toString()
            a= editText.getText().toString()
        }
        button7.setOnClickListener{
            editText.text(editText.getText().contains("7")).toString()
            a= editText.getText().toString()
        }
        button8.setOnClickListener{
            editText.text(editText.getText().contains("8")).toString()
            a= editText.getText().toString()
        }
        button9.setOnClickListener{
            editText.text(editText.getText().contains("9")).toString()
            a= editText.getText().toString()
        }
        addBtn.setOnClickListener{
            editText.text(editText.getText().contains("+")).toString()
            a= editText.getText().toString()

        }
        subBtn.setOnClickListener{
            editText.text(editText.getText().contains("-")).toString()
            a= editText.getText().toString()

        }
        multiplyBtn.setOnClickListener{
            editText.text(editText.getText().contains("x")).toString()
            a= editText.getText().toString()

        }
        divBtn.setOnClickListener{
            editText.text(editText.getText().contains("/")).toString()
            a= editText.getText().toString()

        }
        equalbutton.setOnClickListener{
            b=0
            c=1
            d=1.0
            if (list.size !=0){
                list = mutableListOf<String>()
            }
            if (editText.getText().contains("+")){
                var str = editText.getText().split("+")
                val a = str[0].toDouble()
                val z = a.toInt()
                for (i in 0..str.size-1){
                    if (i==0){
                        list.add(z.toString())
                        b += list.get(i).toInt()

                    }else{
                        list.add(str[i])
                        b+= list.get(i).toInt()
                    }
                }
                editText.setText(String.format("%d",b))
            }
            if (editText.getText().contains("-")) {
                val str = editText.getText().split("-")
                val a = str[0].toDouble()
                val z = a.toLong()
                b = z
                for (i in 0..str.size - 1) {
                    list.add(str[i])
                    if (i != 0) {
                        b -= list.get(i).toInt()

                    }
                }

                editText.setText(String.format("%d", b))
            }

            if (editText.getText().contains("x")) {
                val str = editText.getText().split("x")
                val a = str[0].toDouble()
                val z = a.toInt()

                for (i in 0..str.size - 1) {
                    if(i == 0){
                        list.add(z.toString())
                        c *= list.get(i).toInt()
                    }else{
                        list.add(str[i])
                        c *= list.get(i).toInt()
                    }

                }

                editText.setText(String.format("%d", c))
            }

            if (editText.getText().contains("/")) {
                val str = editText.getText().split("/")
                d = str[0].toDouble()
                for (i in 0..str.size - 1) {
                    list.add(str[i])
                    if (i != 0) {
                        d /= list.get(i).toDouble()

                    }
                }

                editText.setText(String.format("%.2f", d))
            }

        }

        equalbutton.setOnClickListener {
            editText.setText("")

        }


    }
}

private operator fun Any.invoke(contains: Boolean) {

}
