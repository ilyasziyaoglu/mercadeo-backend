package com.andriambavy.ecom.common.basemodel.request.pager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Mehmet Kelleci
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtSearchDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String value;

    private Boolean regex;

}
