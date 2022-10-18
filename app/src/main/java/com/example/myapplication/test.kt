//package com.example.myapplication
//
///**
// * @author pgwstr
// * @date 2022/10/18 22:18
// */
//
//package com.example.alertdlalogex
//
//import android.app.Activity
//import android.app.AlertDialog
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Toast
//import com.example.alertdlalogex.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity(),View.OnClickListener {
//    private lateinit var binding = ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)   //膨胀布局档
//        setContentView(binding.root)    //绑定限制布局(root根目录)
//        binding.pgMyBar.visibility = View.GONE//调用visibility库函数来视图隐藏(加载的图标)
//        binding.bShow.setOnClickListener(this)
////        binding.bShow.setOnClickListener {
////            binding.pgMyBar.visibility = View.VISIBLE
////            val builder = AlertDialog.Builder(this)   //调用AlertDialog的内部类Builder(this用来调用builder实例)
////            builder.setIcon(R.mipmap.ic_launcher)
////            builder.setTitle(R.string.title)
////            builder.setMessage(R.string.message)
////            builder.setPositiveButton(R.string.yes) {    //传入两个参数一个是哪一个对放话框，一个是内容
////                   dialog, which ->
////                    Toast.makeText(this,
////                        R.string.positive,
////                        Toast.LENGTH_LONG).show()
////                binding.pgMyBar.visibility = View.GONE
////            }
////            builder.setNegativeButton(R.string.no) {    //传入两个参数一个是显示的内容
////                 dialog, which ->
////                Toast.makeText(this,
////                    R.string.negative,
////                    Toast.LENGTH_LONG).show()
////                binding.pgMyBar.visibility = View.GONE
////            }
////            builder.setNeutralButton(R.string.cancel) {    //传入两个参数一个是显示的内容
////                    dialog, which ->
////                Toast.makeText(this,
////                    R.string.neutral,
////                    Toast.LENGTH_LONG).show()
////                binding.pgMyBar.visibility = View.GONE
////            }
////            builder.show()
////        }
//    }
//
//    override fun onClick(v: View?) {
//        when(v?.id){
//            R.id.b_show -> {
//                binding.pgMyBar.visibility = View.VISIBLE
//                val builder = AlertDialog.Builder(this)   //调用AlertDialog的内部类Builder(this用来调用builder实例)
//                builder.setIcon(R.mipmap.ic_launcher)
//                builder.setTitle(R.string.title)
//                builder.setMessage(R.string.message)
//                builder.setPositiveButton(R.string.yes) {    //传入两个参数一个是哪一个对放话框，一个是内容
//                        dialog, which ->
//                    Toast.makeText(this,
//                        R.string.positive,
//                        Toast.LENGTH_LONG).show()
//                    binding.pgMyBar.visibility = View.GONE
//                }
//                builder.setNegativeButton(R.string.no) {    //传入两个参数一个是显示的内容
//                        dialog, which ->
//                    Toast.makeText(this,
//                        R.string.negative,
//                        Toast.LENGTH_LONG).show()
//                    binding.pgMyBar.visibility = View.GONE
//                }
//                builder.setNeutralButton(R.string.cancel) {    //传入两个参数一个是显示的内容
//                        dialog, which ->
//                    Toast.makeText(this,
//                        R.string.neutral,
//                        Toast.LENGTH_LONG).show()
//                    binding.pgMyBar.visibility = View.GONE
//                }
//                builder.show()
//            }
//
//        }
//    }
//}