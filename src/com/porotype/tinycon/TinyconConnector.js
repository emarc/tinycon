
window.com_porotype_tinycon_Tinycon = function() {
	Tinycon.reset();
	
    this.setBubble = function(n) {
        Tinycon.setBubble(""+n);
    }
    
    this.reset = function() {
    	Tinycon.reset();
    }
    
    this.setOptions = function(opts) {
    	Tinycon.setOptions(eval(opts));
    }
    
} 