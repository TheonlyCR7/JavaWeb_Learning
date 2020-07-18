package Demo.service;



import Demo.domain.Province;

import java.util.List;

public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();
}
