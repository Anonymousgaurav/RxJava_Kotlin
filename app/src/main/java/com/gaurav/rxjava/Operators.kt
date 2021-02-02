package com.gaurav.rxjava

import android.util.Log
import com.gaurav.rxjava.MainActivity.Companion.TAG
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.*

val mListNum = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 145)
val arraysOfNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 145)
val arraysOfNum2 = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150)


fun justOperator() {


    val observalble = Observable.just(mListNum)
    val observer = object : Observer<List<Int>> {
        override fun onSubscribe(d: Disposable?) {
            Log.d(MainActivity.TAG, "onSubscribe")
        }

        override fun onNext(t: List<Int>?) {
            Log.d(MainActivity.TAG, "onNext : $t")
        }

        override fun onError(e: Throwable?) {
            Log.d(MainActivity.TAG, "onError : ${e.toString()}")
        }

        override fun onComplete() {
            Log.d(MainActivity.TAG, "onComplete")
        }
    }


//        val observer = object : Observer<Int> {
//            override fun onSubscribe(d: Disposable?) {
//                Log.d(TAG, "onSubscribe")
//
//            }
//
//            override fun onNext(t: Int?) {
//                Log.d(TAG, "onNext : $t")
//            }
//
//            override fun onError(e: Throwable?) {
//                Log.d(TAG, "onError : ${e.toString()}")
//            }
//
//            override fun onComplete() {
//                Log.d(TAG, "onComplete")
//            }
//        }


    observalble.subscribe(observer)
}




fun fromOperator()
{
    val observalble = Observable.fromArray(arraysOfNum,arraysOfNum2)


    val observer = object : Observer<Array<Int>>
    {
        override fun onSubscribe(d: Disposable?) {
            Log.d(TAG, "onSubscribe")
        }

        override fun onNext(t: Array<Int>?) {
            Log.d(TAG, "onNext : ${Arrays.toString(t)}")
        }

        override fun onError(e: Throwable?) {
            Log.d(TAG, "onError : ${e.toString()}")
        }

        override fun onComplete() {
            Log.d(TAG, "onComplete")
        }

    }

    observalble.subscribe(observer)

}