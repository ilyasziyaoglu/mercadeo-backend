package com.mercadeo.ecom.product.mapper;

import com.mercadeo.ecom.brand.db.entity.Brand;
import com.mercadeo.ecom.client.brand.BrandRequest;
import com.mercadeo.ecom.client.brand.BrandResponse;
import com.mercadeo.ecom.client.color.ColorRequest;
import com.mercadeo.ecom.client.color.ColorResponse;
import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.client.productcolor.ProductColorRequest;
import com.mercadeo.ecom.client.productcolor.ProductColorResponse;
import com.mercadeo.ecom.client.productsize.SizeRequest;
import com.mercadeo.ecom.client.productsize.SizeResponse;
import com.mercadeo.ecom.client.stock.StockRequest;
import com.mercadeo.ecom.client.stock.StockResponse;
import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import com.mercadeo.ecom.sizes.db.entity.Size;
import com.mercadeo.ecom.stock.db.entity.Stock;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-26T21:43:13+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( request.getId() );
        product.setCode( request.getCode() );
        product.setName( request.getName() );
        product.setBrand( brandRequestToBrand( request.getBrand() ) );
        product.setImgUrl( request.getImgUrl() );
        product.setPrice( request.getPrice() );
        product.setCategory1( request.getCategory1() );
        product.setCategory2( request.getCategory2() );
        product.setCategory3( request.getCategory3() );
        product.setCollection( request.getCollection() );
        product.setDescription( request.getDescription() );
        product.setStatus( request.getStatus() );
        product.setProductColors( productColorRequestListToProductColorList( request.getProductColors() ) );
        product.setIsColorsOptional( request.getIsColorsOptional() );
        product.setStocks( stockRequestListToStockList( request.getStocks() ) );
        product.setSizes( sizeRequestListToSizeList( request.getSizes() ) );
        product.setIsSizesOptional( request.getIsSizesOptional() );
        product.setFeatures( request.getFeatures() );
        product.setTags( request.getTags() );

        return product;
    }

    @Override
    public ProductResponse toResponse(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setId( entity.getId() );
        productResponse.setCode( entity.getCode() );
        productResponse.setName( entity.getName() );
        productResponse.setBrand( brandToBrandResponse( entity.getBrand() ) );
        productResponse.setImgUrl( entity.getImgUrl() );
        productResponse.setPrice( entity.getPrice() );
        productResponse.setCategory1( entity.getCategory1() );
        productResponse.setCategory2( entity.getCategory2() );
        productResponse.setCategory3( entity.getCategory3() );
        productResponse.setCollection( entity.getCollection() );
        productResponse.setStatus( entity.getStatus() );
        productResponse.setProductColors( productColorListToProductColorResponseList( entity.getProductColors() ) );
        productResponse.setSizes( sizeListToSizeResponseList( entity.getSizes() ) );
        productResponse.setStocks( stockListToStockResponseList( entity.getStocks() ) );
        productResponse.setIsColorsOptional( entity.getIsColorsOptional() );
        productResponse.setIsSizesOptional( entity.getIsSizesOptional() );
        productResponse.setDescription( entity.getDescription() );
        productResponse.setFeatures( entity.getFeatures() );
        productResponse.setTags( entity.getTags() );

        return productResponse;
    }

    @Override
    public List<Product> toEntity(List<ProductRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( requestList.size() );
        for ( ProductRequest productRequest : requestList ) {
            list.add( toEntity( productRequest ) );
        }

        return list;
    }

    @Override
    public List<ProductResponse> toResponse(List<Product> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ProductResponse> list = new ArrayList<ProductResponse>( requestList.size() );
        for ( Product product : requestList ) {
            list.add( toResponse( product ) );
        }

        return list;
    }

    protected Brand brandRequestToBrand(BrandRequest brandRequest) {
        if ( brandRequest == null ) {
            return null;
        }

        Brand brand = new Brand();

        brand.setId( brandRequest.getId() );
        brand.setName( brandRequest.getName() );
        brand.setLogoImgUrl( brandRequest.getLogoImgUrl() );
        brand.setStatus( brandRequest.getStatus() );

        return brand;
    }

    protected Color colorRequestToColor(ColorRequest colorRequest) {
        if ( colorRequest == null ) {
            return null;
        }

        Color color = new Color();

        color.setId( colorRequest.getId() );
        color.setName( colorRequest.getName() );
        color.setImgUrl( colorRequest.getImgUrl() );

        return color;
    }

    protected ProductColor productColorRequestToProductColor(ProductColorRequest productColorRequest) {
        if ( productColorRequest == null ) {
            return null;
        }

        ProductColor productColor = new ProductColor();

        productColor.setId( productColorRequest.getId() );
        productColor.setColor( colorRequestToColor( productColorRequest.getColor() ) );
        productColor.setStatus( productColorRequest.getStatus() );
        productColor.setImgUrl( productColorRequest.getImgUrl() );

        return productColor;
    }

    protected List<ProductColor> productColorRequestListToProductColorList(List<ProductColorRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductColor> list1 = new ArrayList<ProductColor>( list.size() );
        for ( ProductColorRequest productColorRequest : list ) {
            list1.add( productColorRequestToProductColor( productColorRequest ) );
        }

        return list1;
    }

    protected Stock stockRequestToStock(StockRequest stockRequest) {
        if ( stockRequest == null ) {
            return null;
        }

        Stock stock = new Stock();

        stock.setId( stockRequest.getId() );
        stock.setColor( colorRequestToColor( stockRequest.getColor() ) );
        stock.setStock( stockRequest.getStock() );

        return stock;
    }

    protected List<Stock> stockRequestListToStockList(List<StockRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<Stock> list1 = new ArrayList<Stock>( list.size() );
        for ( StockRequest stockRequest : list ) {
            list1.add( stockRequestToStock( stockRequest ) );
        }

        return list1;
    }

    protected Size sizeRequestToSize(SizeRequest sizeRequest) {
        if ( sizeRequest == null ) {
            return null;
        }

        Size size = new Size();

        size.setId( sizeRequest.getId() );
        size.setName( sizeRequest.getName() );

        return size;
    }

    protected List<Size> sizeRequestListToSizeList(List<SizeRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<Size> list1 = new ArrayList<Size>( list.size() );
        for ( SizeRequest sizeRequest : list ) {
            list1.add( sizeRequestToSize( sizeRequest ) );
        }

        return list1;
    }

    protected BrandResponse brandToBrandResponse(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandResponse brandResponse = new BrandResponse();

        brandResponse.setId( brand.getId() );
        brandResponse.setName( brand.getName() );
        brandResponse.setLogoImgUrl( brand.getLogoImgUrl() );
        brandResponse.setStatus( brand.getStatus() );

        return brandResponse;
    }

    protected ColorResponse colorToColorResponse(Color color) {
        if ( color == null ) {
            return null;
        }

        ColorResponse colorResponse = new ColorResponse();

        colorResponse.setId( color.getId() );
        colorResponse.setName( color.getName() );
        colorResponse.setImgUrl( color.getImgUrl() );

        return colorResponse;
    }

    protected ProductColorResponse productColorToProductColorResponse(ProductColor productColor) {
        if ( productColor == null ) {
            return null;
        }

        ProductColorResponse productColorResponse = new ProductColorResponse();

        productColorResponse.setId( productColor.getId() );
        productColorResponse.setColor( colorToColorResponse( productColor.getColor() ) );
        productColorResponse.setImgUrl( productColor.getImgUrl() );
        productColorResponse.setStatus( productColor.getStatus() );

        return productColorResponse;
    }

    protected List<ProductColorResponse> productColorListToProductColorResponseList(List<ProductColor> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductColorResponse> list1 = new ArrayList<ProductColorResponse>( list.size() );
        for ( ProductColor productColor : list ) {
            list1.add( productColorToProductColorResponse( productColor ) );
        }

        return list1;
    }

    protected SizeResponse sizeToSizeResponse(Size size) {
        if ( size == null ) {
            return null;
        }

        SizeResponse sizeResponse = new SizeResponse();

        sizeResponse.setId( size.getId() );
        sizeResponse.setName( size.getName() );

        return sizeResponse;
    }

    protected List<SizeResponse> sizeListToSizeResponseList(List<Size> list) {
        if ( list == null ) {
            return null;
        }

        List<SizeResponse> list1 = new ArrayList<SizeResponse>( list.size() );
        for ( Size size : list ) {
            list1.add( sizeToSizeResponse( size ) );
        }

        return list1;
    }

    protected StockResponse stockToStockResponse(Stock stock) {
        if ( stock == null ) {
            return null;
        }

        StockResponse stockResponse = new StockResponse();

        stockResponse.setId( stock.getId() );
        stockResponse.setColor( colorToColorResponse( stock.getColor() ) );
        stockResponse.setStock( stock.getStock() );

        return stockResponse;
    }

    protected List<StockResponse> stockListToStockResponseList(List<Stock> list) {
        if ( list == null ) {
            return null;
        }

        List<StockResponse> list1 = new ArrayList<StockResponse>( list.size() );
        for ( Stock stock : list ) {
            list1.add( stockToStockResponse( stock ) );
        }

        return list1;
    }
}
