package JSONBuilder;

/**
 * Created by mikhailovra on 02.09.2017.
 */
public class JSONBuilderImp implements JSONBuilder {

    private JSONObject jsonObject;
    private int count = 0;
    private String begin = "{";
    private String end  = "\n}";
    private String body = "";

    @Override
    public void create() {
        this.jsonObject = new JSONObject();
    }


    public JSONBuilderImp(){
    }

    public static Builder newBuilder(){
        return new JSONBuilderImp().new Builder();
    }

    public class Builder{
        private JSONBuilderImp jsonObject;

        public Builder withParam(String key, String value){
            JSONBuilderImp.this.withParam(key,value);
            return this;
         }

        public JSONBuilderImp build(){
            return JSONBuilderImp.this;
        }
    }
   /* @Override
    public void withParam(String key, String value) {
        if (count == 0) {
            jsonObject.addValue(key, value);
            this.count+=1;
        } else {
            jsonObject.addValue(key, value, false);
            this.count+=1;
        }
    }

    @Override
    public void withParam(String key, JSONObject value) {
    }
*/
    @Override
    public String toString(){
        return jsonObject.toString();
    }




    public void withParam(String key, String value){
        if (this.count == 0) {
            this.jsonObject = new JSONObject().addValue(key, value);
            this.count +=1;
        }
        else
            this.jsonObject = new JSONObject().addValue(key,value,false);
    }



    /*@Override
    public void close() {
        this.jsonObject = jsonObject + "}";
    }

    @Override
    public void withParam(String key, String value) {
        if (jsonObject.charAt(jsonObject.length() - 1) != '{')
            this.jsonObject = "," + jsonObject + "\"" + key + "\":\"" + value + "\"";
        else
            this.jsonObject = jsonObject + "\"" + key + "\":\"" + value + "\"";
    }

    @Override
    public void withParam(String key, JSONObject value) {
        if (jsonObject.charAt(jsonObject.length() - 1) != '{')
            this.jsonObject = "," + jsonObject + "\"" + key + "\":\"" + value.toString() + "\"";
        else
            this.jsonObject = jsonObject + "\"" + key + "\":\"" + value + "\"";

    }*/
}
