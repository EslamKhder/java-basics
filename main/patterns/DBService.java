package main.patterns;

public class DBService {

    private SchoolService schoolService;

    public DBService(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    void save(){
        schoolService.save();
    }

    void update(){
        schoolService.update();
    }

    void delete(){
        schoolService.delete();
    }
}
