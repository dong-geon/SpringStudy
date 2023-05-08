package framework;

public abstract class ItemCreator {
    public Item create() {
        Item item;

        // step1
        requestItemsInfomation();
        // step2
        item = createItem();
        // step3
        createItemLog();
        return item;
    }
    // 아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청
    abstract protected void requestItemsInfomation();
    // 아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성정보를 남김
    abstract protected void createItemLog();
    // 아이템 생성 알고리즘
    abstract protected Item createItem();


}
