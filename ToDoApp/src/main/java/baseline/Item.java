package baseline;

import java.time.LocalDate;

public class Item {
    private String itemDescription;
    private LocalDate itemDueDate;

    public LocalDate getItemDueDate() {
        return itemDueDate;
    }

    public void setItemDueDate(LocalDate itemDueDate) {
        this.itemDueDate = itemDueDate;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Item(String itemDescription, LocalDate itemDueDate) {
        this.itemDescription = itemDescription;
        this.itemDueDate = itemDueDate;
    }
}
