if (typeof jQuery !== 'undefined') {
    (function ($) {
        $('#spinner').ajaxStart(function () {
            $(this).fadeIn();
        }).ajaxStop(function () {
                $(this).fadeOut();
            });
    })(jQuery);
}
var FSQSampleApp = {
    doOnSuccess:function () {
        alert("We have OAuth token")
    },
    doOnFailure:function () {
        alert("We do not have OAuth token")
    }
}
