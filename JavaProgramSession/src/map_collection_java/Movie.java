package map_collection_java;

public class Movie {
    int boxCollection;
    String mname;
    Producer p;
  //  Movie(){}

	/*
	 * public int getBoxCollection() { return boxCollection; } public void
	 * setBoxCollection(int boxCollection) { this.boxCollection = boxCollection; }
	 * public String getMname() { return mname; } public void setMname(String mname)
	 * { this.mname = mname; } public Producer getP() { return p; } public void
	 * setP(Producer p) { this.p = p; }
	 */
	Movie(int boxCollection,String mname,Producer p){
		this.boxCollection=boxCollection;
		this.mname=mname;
		this.p=p;
	}
}
