package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int numElements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {

        list = new int[size];
        numElements=0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        numElements= list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //adding the method increaseSize()
    public void increaseSize(){
        int[] newTab =new int[list.length*2];
        for(int i=0;i<list.length;i++){
            newTab[i]=list[i];
        }
        this.list=newTab;
    }

    //method void addElement(int newVal)
    public void addElement(int newVal){
        if(numElements==list.length){ //cheking if the size is enough if not we increase
            increaseSize();
        }
        list[numElements]=newVal;
        numElements++; //increase the number of elements
    }

    //method removeFirst
    public void removeFirst(int newVal){
        for(int i=0;i<numElements;i++){ //we loop to find the first element that satisfy the equality
            if(list[i]==newVal){
                for(int j=i;j<numElements-1;j++){
                    list[j]=list[j+1]; //we remove it and we translate every element after to his new position
                }
                numElements--; //decrease the number of elements
                break;
            }

        }
    }

    //methode removeAll
    public void removeAll(int newVal){
        for(int i=0;i<numElements;i++){ //we do the same as removeFirst but this time we don't stop at the first occurence
            if(list[i]==newVal){
                for(int j=i;j<numElements-1;j++){
                    list[j]=list[j+1];
                }
                i--;
                numElements--;
            }
        }

    }
}