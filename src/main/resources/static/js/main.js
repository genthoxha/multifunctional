/*
    Main.js
    Onclick events for crud operations and sorting
 */

$(document).ready(function () {
    $('.nBtn,.table .eBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();
        if (text == 'Edit') {
            $.get(href, function (product, status) {
                $('.myForm #id').val(product.id);
                $('.myForm #productName').val(product.productName);
                $('.myForm #producer').val(product.producer);
                $('.myForm #category').val(product.category);
                $('.myForm #price').val(product.price);
            });
            $('.myForm #exampleModal').modal();
        } else {
            $('.myForm #id').val('');
            $('.myForm #productName').val('');
            $('.myForm #producer').val('');
            $('.myForm #category').val('');
            $('.myForm #price').val('');
            $('.myForm #exampleModal').modal();
        }

    });

    $('.table .delBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href',href);
        $('#myModal').modal();

    });


});



