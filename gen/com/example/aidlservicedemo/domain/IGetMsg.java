/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: F:\\androidproject\\AidlClientDemo\\src\\com\\example\\aidlservicedemo\\domain\\IGetMsg.aidl
 */
package com.example.aidlservicedemo.domain;
public interface IGetMsg extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.aidlservicedemo.domain.IGetMsg
{
private static final java.lang.String DESCRIPTOR = "com.example.aidlservicedemo.domain.IGetMsg";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.aidlservicedemo.domain.IGetMsg interface,
 * generating a proxy if needed.
 */
public static com.example.aidlservicedemo.domain.IGetMsg asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.aidlservicedemo.domain.IGetMsg))) {
return ((com.example.aidlservicedemo.domain.IGetMsg)iin);
}
return new com.example.aidlservicedemo.domain.IGetMsg.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getMes:
{
data.enforceInterface(DESCRIPTOR);
User _arg0;
if ((0!=data.readInt())) {
_arg0 = User.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<Message> _result = this.getMes(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.aidlservicedemo.domain.IGetMsg
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.util.List<Message> getMes(User us) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<Message> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((us!=null)) {
_data.writeInt(1);
us.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getMes, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(Message.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getMes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public java.util.List<Message> getMes(User us) throws android.os.RemoteException;
}
