<?php
/**
 * Created by Harry Kurniawan
 * Email: harry@harrykrn.com | k.harry791@gmail.com
 * Date: 04/01/17
 * Time: 12:12
 */

error_reporting(E_ALL);

$method  	= $_SERVER['REQUEST_METHOD'];
$headers 	= apache_request_headers();
$result 	= [];
$json 		= file_get_contents('php://input');
$obj 		= json_decode($json);

if (array_key_exists('Content-Type', $headers) && $headers['Content-Type'] == "application/json") {
  
  $result = [
	  			"msg" => "success",
	  			"msg" => $method,
	  			"data" => $obj,
  			];

} else {

  $result = ["msg" => "error"];

}

echo json_encode($result);
exit;

?>