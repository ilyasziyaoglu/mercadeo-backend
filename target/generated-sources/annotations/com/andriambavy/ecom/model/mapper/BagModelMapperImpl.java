package com.andriambavy.ecom.model.mapper;

import com.andriambavy.ecom.client.model.ModelRequest;
import com.andriambavy.ecom.client.model.ModelResponse;
import com.andriambavy.ecom.model.db.entity.Model;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-21T02:19:25+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class BagModelMapperImpl implements BagModelMapper {

    @Override
    public Model toEntity(ModelRequest request) {
        if ( request == null ) {
            return null;
        }

        Model model = new Model();

        model.setId( request.getId() );
        model.setName( request.getName() );
        model.setPrice( request.getPrice() );
        model.setCategory( request.getCategory() );
        model.setColors( request.getColors() );

        return model;
    }

    @Override
    public ModelResponse toResponse(Model entity) {
        if ( entity == null ) {
            return null;
        }

        ModelResponse modelResponse = new ModelResponse();

        modelResponse.setId( entity.getId() );
        modelResponse.setName( entity.getName() );
        modelResponse.setPrice( entity.getPrice() );
        modelResponse.setCategory( entity.getCategory() );
        modelResponse.setColors( entity.getColors() );

        return modelResponse;
    }

    @Override
    public List<Model> toEntity(List<ModelRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Model> list = new ArrayList<Model>( requestList.size() );
        for ( ModelRequest modelRequest : requestList ) {
            list.add( toEntity( modelRequest ) );
        }

        return list;
    }

    @Override
    public List<ModelResponse> toResponse(List<Model> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ModelResponse> list = new ArrayList<ModelResponse>( requestList.size() );
        for ( Model model : requestList ) {
            list.add( toResponse( model ) );
        }

        return list;
    }
}
