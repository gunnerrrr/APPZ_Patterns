package patterns.APPZ.abstract_factory.umlClass;

import patterns.APPZ.abstract_factory.Component;

public class UmlClassComponent implements Component{
    private Integer componentId;
    private String type;
    private String name;
    private String body;
    @Override
    public boolean checkComponent() {
        //logic will be complicated
        if(!type.equals("Class") && !type.equals("Interface")) {
            return false;
        }
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
