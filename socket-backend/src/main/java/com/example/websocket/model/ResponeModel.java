/**
 * 
 */
package com.example.websocket.model;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author PhongNc
 *	11:49:52 AM : Jun 14, 2023 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponeModel {

	List<MessageModel> list;

}
