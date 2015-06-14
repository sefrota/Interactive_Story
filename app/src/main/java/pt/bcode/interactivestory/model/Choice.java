package pt.bcode.interactivestory.model;

/**
 * Created by Sergio on 12-06-2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice (String text, int nextPage){
        this.mText = text;
        this.mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
