package com.gaurav.rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class MainActivity : AppCompatActivity() {


    companion object {
        const val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        rangeOperator().subscribe(
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                },
//                {
//                    Log.d(TAG, "onComplete")
//                }
//        )


//        repeatOperator().subscribe(
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                },
//                {
//                    Log.d(TAG, "onComplete")
//                }
//        )

//        intervalOperator().subscribe(
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                },
//                {
//                    Log.d(TAG, "onComplete")
//                }
//        )


//        timerOperator().subscribe(
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                },
//                {
//                    Log.d(TAG, "onComplete")
//                }
//        )
//

//        createOperator().subscribe(
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                },
//                {
//                    Log.d(TAG, "onComplete")
//                }
//        )


        filterOperator().filter {
            it.age > 18
        }.subscribe(

                {
                    Log.d(TAG, "onNext : $it")
                },
                {
                    Log.d(TAG, "onError : ${it.toString()}")
                },
                {
                    Log.d(TAG, "onComplete")
                }


        )
    }


}