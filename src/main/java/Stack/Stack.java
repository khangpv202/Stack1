package Stack;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: khangpv
 * Date: 6/18/13
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    private ArrayList<String> listMembers;

    public Stack(){
        listMembers = new ArrayList<String>();
    }
    public int size() {
        return listMembers.size();
    }

    public void push(String firstValue) {
        listMembers.add(firstValue);
    }

    public String top() {
        if(listMembers.size()==0)
            return null;  //To change body of created methods use File | Settings | File Templates.
        else return  listMembers.get(listMembers.size()-1);
    }

    public String pop() {
        if(listMembers.size()==0) throw new NullPointerException(" StackEmptyException");
        else{
            String va = listMembers.get(listMembers.size()-1);
            listMembers.remove(listMembers.size()-1);
            return va;
        }
    }
}
