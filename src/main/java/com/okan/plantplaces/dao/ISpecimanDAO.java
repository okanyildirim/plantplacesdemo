package com.okan.plantplaces.dao;

import com.okan.plantplaces.model.Specimen;

public interface ISpecimanDAO {

    boolean save(Specimen specimen) throws Exception;
}
