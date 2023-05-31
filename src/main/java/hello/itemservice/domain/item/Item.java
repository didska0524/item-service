package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
    //int가 아닌 Integer을 사용하는 이유는 null일 경우도 대비한다.
    //int는 공백값을 0으로 처리하는 반면 Integer는 null로 처리하기때문


    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
