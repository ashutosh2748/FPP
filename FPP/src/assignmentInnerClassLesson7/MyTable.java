package assignmentInnerClassLesson7;

public class MyTable {
private Entry[] entries=new Entry[26];
//returns the String that is matched with char c in the table
public String get(char c){
//implement
	if (entries[returnIndex(c)]!=null)
	return entries[returnIndex(c)].getEntryOf(c);
	else return "Not Found";
//return null;
}
public Entry[] getEntries() {
	return entries;
}
public void setEntries(Entry[] entries) {
	this.entries = entries;
}
//adds to the table a pair (c, s) so that s can be looked up using c
public void add(char c, String s) {
//implement
				entries[returnIndex(c)]=new Entry(s,c);
}


public static int returnIndex(char c)
{
	return Integer.valueOf(c)-97;
}
//returns a String consisting of nicely formatted display
//of the contents of the table
public String toString() {
	StringBuilder str= new StringBuilder();
	for(int i=0;i<26;i++)
		if(entries[i]!=null)
		{
			str.append( entries[i].toString());
			str.append("\n");
			
		}
//implement
		return str.toString();
}
private class Entry {
	private char index;
	private String name; 
	
Entry(String str, char ch){
	
		this.index=ch;
		this.name=str;
		
	}
public String getEntryOf(char ind)
{
	if(this.index==ind)
return this.name;
	else return "Not Found";	//return null;
}

//implement


public char getIndex() {
	return index;
}

public void setIndex(char index) {
	this.index = index;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


//returns a String of the form "ch->str"
public String toString() {
	
//implement
return getIndex()+"->"+getName();
}
}
}


