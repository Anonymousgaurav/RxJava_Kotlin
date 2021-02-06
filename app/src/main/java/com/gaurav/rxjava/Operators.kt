package com.gaurav.rxjava

import android.util.Log
import com.gaurav.rxjava.MainActivity.Companion.TAG
import com.gaurav.rxjava.data.User
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.*
import java.util.concurrent.TimeUnit

val mListNum = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
val arraysOfNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 145)
val arraysOfNum2 = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150)

val mUserList = mutableListOf<User>(
        User(1, "Gaurav", 20),
        User(1, "Shibu", 25),
        User(1, "Avinash", 30),
        User(1, "Abhishek", 12),
        User(1, "Arun", 15),
        User(1, "Ashish", 16),
        User(1, "Vivek", 18)
)


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

fun fromOperator() {
    val observalble = Observable.fromArray(arraysOfNum, arraysOfNum2)


    val observer = object : Observer<Array<Int>> {
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

fun fromIterableOperator() {
    val observable = Observable.fromIterable(mListNum)


    val observer = object : Observer<Int> {
        override fun onSubscribe(d: Disposable?) {
            Log.d(TAG, "onSubscribe")
        }

        override fun onNext(t: Int?) {
            Log.d(TAG, "onNext : $t")
        }

        override fun onError(e: Throwable?) {
            Log.d(TAG, "onError : ${e.toString()}")
        }

        override fun onComplete() {
            Log.d(TAG, "onComplete")
        }


    }

    observable.subscribe(observer)

}


fun rangeOperator(): Observable<Int> {
    return Observable.range(1, 100)
}


fun repeatOperator(): Observable<Int> {
    //  how many times you want to repeat the values
    return Observable.range(1, 10).repeat(3)
}


fun intervalOperator(): Observable<Long> {
    return Observable.interval(1, TimeUnit.SECONDS).takeWhile { value ->
        value <= 10
    }

    // emit the value continously
    // after 10 seconds it will terminate
}

fun timerOperator(): Observable<Long> {

    // it will not emit the value continuosly
    return Observable.timer(5, TimeUnit.SECONDS)
}


fun createOperator(): Observable<Int> {

    // it will not emit the value continuosly
    return Observable.create(ObservableOnSubscribe<Int>
    {
        try {
            for (i in mListNum) {
                it.onNext(i * 5)
            }

            it.onComplete()

        } catch (e: Exception) {
            it.onError(e)

        }
    })
}


fun filterOperator(): Observable<User> {
    return Observable.fromIterable(mUserList)
}