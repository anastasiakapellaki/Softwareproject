class Certification_Document{

    private int code;
    private String path;
    private String owner_username;
    public Certification_Document(int code, String path, String owner_username) {
        this.code = code;
        this.path = path;
        this.owner_username = owner_username;}
    public void setCode(int code) {
        this.code = code;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public void setOwnerUsername(String owner_username) {
        this.owner_username = owner_username;
    }
    public int getCode() {
        return code;
    }

    public String getPath() {
        return path;
    }

    public String getOwnerUsername() {
        return owner_username;
    }


}