package Inheritance;

public abstract class Account {
    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        this.myData = _myData;
        this.myData.execute();
    }
}

