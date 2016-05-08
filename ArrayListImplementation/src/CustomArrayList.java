import java.util.Arrays;

public class CustomArrayList {// create arrayList Object and 
	//it contain add(), get(), remove(), size() methods. 
	//Use dynamic array logic. It  increase its size when it reaches threshold.
private Object[] myStore;
private int actSize;
// initialize array
public CustomArrayList(){
	myStore= new Object[10];
	actSize=0;
	
	
}
// get method
public Object get(int index){
	if(index>actSize)// if index is greater than the size of the array!
		System.out.println("ArrayOutOfBound Exception");
	return myStore[index];
}
// add method
public void add(Object obj){
	if( myStore.length-actSize<5)
		increaseSize();
	myStore[actSize++]=obj;
	
}
// increase the size of my array size.
public void increaseSize(){
	myStore=Arrays.copyOf(myStore, myStore.length*2);
	System.out.println("\n New lenth"+myStore.length);
}
//
public Object remove(int index){
	Object obj= new Object();
	if( index<actSize){
		
		obj= myStore[index];
		myStore[index]=null;
			}
	int temp=index;
	while(temp<actSize){
		myStore[temp]=myStore[temp+1];
		myStore[temp+1]=null;
		temp++;
	}
	actSize--;
	return obj;
}
public int size(){
	return actSize;
	
}
}
