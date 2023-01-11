package ordering.system;
public class Menu {
    private String name;
    private String des;
    private String rate;

    public Menu() {
    }

    public String getName() {
        return name;
    }
    public String getDes() {
        return des;
    }
    public String getRate() {
        return rate;
    }
    public String showName() {
        return "Name-Menu";
    }
    public String showDes() {
        return "Description-Menu";
    }
    public String showRate() {
        return "Rate-Menu";
    }
}

// western food intro
class western extends Menu {
    
    public western() {
    }
    
    @Override
    public String showName() {
        return "WESTERN CUISINE";
    }
    
    @Override
    public String showDes() {
        return "Western cuisine is the cuisines of Europe and the other Western country.";
    }
    
    @Override
    public String showRate() {
        return "3 Stars";
    }
}

// chinese food intro
class chinese extends Menu {
    
    public chinese() {
    }
    
    @Override
    public String showName() {
        return "CHINESE CUISINE";
    }
    
    @Override
    public String showDes() {
        return "Chinese Cuisine is an important part of Chinese culture and includes cuisines orginating from China.";
    }
    
    @Override
    public String showRate() {
        return "5 Stars";
    }
}

// indian food intro
class indian extends Menu {
    
    public indian() {
    }
    
    @Override
    public String showName() {
        return "INDIAN CUISINE";
    }
    
    @Override
    public String showDes() {
        return "Indian Cuisine is one of the world's most diverse cuisines.";
    }
    
    @Override
    public String showRate() {
        return "4 Stars";
    }
}
