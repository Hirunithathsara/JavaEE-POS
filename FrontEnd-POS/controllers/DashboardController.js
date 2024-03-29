let baseUrl = "http://localhost:8080/javaee_pos/";

$("#txtCustomerCount").val("00");
$.ajax({
    url: baseUrl + "customer?option=customerCount",
    method: "GET",
    contentType: "application/json",
    dataType: "json",
    success: function (resp) {
        $("#txtCustomerCount").text(resp.count);
    },
    error: function (error) {
        console.log("Customer Count Error : ", error);
    }
});

$("#txtItemsCount").val("00");
$.ajax({
    url: baseUrl + "item?option=itemCount",
    method: "GET",
    contentType: "application/json",
    dataType: "json",
    success: function (resp) {
        $("#txtItemsCount").text(resp.count);
    },
    error: function (error) {
        console.log("Item Count Error : ", error);
    }
});

$("#txtOrderCount").val("00");
$.ajax({
    url: baseUrl + "orders?option=ordersCount",
    method: "GET",
    contentType: "application/json",
    dataType: "json",
    success: function (resp) {
        $("#txtOrderCount").text(resp.count);
    },
    error: function (error) {
        console.log("Orders Count Error : ", error);
    }
});