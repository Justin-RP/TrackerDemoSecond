package com.swfinder.method;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.swfinder.entity.Bluetooth;
import com.swfinder.helper.SwalleLightSQLiteHelper;

import java.util.ArrayList;
import java.util.List;

public class BluetoothFirebaseClass {

    private static final String TAG = "BluetoothFirebaseClass";

    Context context;
    SQLiteDatabase db;
    SwalleLightSQLiteHelper helper;


    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference bluetoothListRef;

    public BluetoothFirebaseClass(Context context) {
        this.context = context;

        firebaseDatabase = FirebaseDatabase.getInstance();
        bluetoothListRef = firebaseDatabase.getReference("/biikenList");
    }

    /**
     * Insert bluetooth device record
     * @param bluetooth
     */
    public void InsertBluetooth(Bluetooth bluetooth) {

        String name = bluetooth.getName();
//        String desc = bluetooth.getDesc();
        String date = bluetooth.getDate();
        String address = bluetooth.getAddress();
        String toux = bluetooth.getToux();

        bluetoothListRef.push().setValue(bluetooth);
        Log.e(TAG, "--InsertBluetooth");
    }

    /**
     * Delete selected Bluetooth device record
     */
    public void DeleteBluetooth(String bluetooth_address){
        bluetoothListRef.child(bluetooth_address).removeValue();
        Log.e(TAG, "--DeleteBluetooth");
    }

    /**
     * Update selected bluetooth device record
     */
    public void UpdateBluetooth(Bluetooth bluetooth) {
        bluetoothListRef.child(bluetooth.getAddress()).setValue(bluetooth);
        Log.e(TAG, "--UpdateBluetooth");
    }

    /**
     * Search for bluetooth device records
     */
//    public List<Bluetooth> SelectBluetooth() {
//        bluetoothListRef.child()
//    }
//
//    /**
//     * Search for selected bluetooth device record
//     */
//    public Bluetooth SelectBluetooth(String address) {
//        bluetoothListRef.child(address);
//        Log.e(TAG, "--UpdateBluetooth");
//    }
}
