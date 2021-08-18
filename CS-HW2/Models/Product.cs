using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RazorAndData.Models
{
    public class Product
    {
        public int UserId { get; set; } 
        public int Id { get; set; }
        public String Title { get; set; }
        public String Body { get; set; }
    }
}
