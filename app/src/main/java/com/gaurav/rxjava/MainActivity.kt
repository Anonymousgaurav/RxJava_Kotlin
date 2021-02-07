package com.gaurav.rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gaurav.rxjava.data.User
import com.gaurav.rxjava.data.UserProfile
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

//
//        filterOperator().filter {
//            it.age > 18
//        }.subscribe(
//
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


//        lastOperator().last(User(1, "Gaurav", 20)).subscribe(
//
//
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                }
//
//        )


        // distinctOperator().
//        distinct { it.age }
//        distinct()
//                .subscribe(
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                }
//
//        )


//         skipOperator().
//                 // skip(3)
//                 skipLast(2)
//              //   .distinct()   optional
//                .subscribe(
//                {
//                    Log.d(TAG, "onNext : $it")
//                },
//                {
//                    Log.d(TAG, "onError : ${it.toString()}")
//                }
//
//        )


//        bufferOperator().
//        buffer(2)
//                .subscribe(
//                        {
//                            Log.d(TAG, "onNext : $it")
//                        },
//                        {
//                            Log.d(TAG, "onError : ${it.toString()}")
//                        }
//
//                )
//
//


        mapOperator().
                // map { it.age * 2 }
        map { UserProfile(it.id, it.name, it.age, "http://test.com/${it.id}") }
                .subscribe(
                        {
                            Log.d(TAG, "onNext : $it")
                        },
                        {
                            Log.d(TAG, "onError : ${it.toString()}")
                        }

                )


    }


}