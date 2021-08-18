using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Logging;
using RazorAndData.Models;
using RazorAndData.Services;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RazorAndData.Pages
{
    public class IndexModel : PageModel
    {
        private readonly ILogger<IndexModel> _logger;
        public JsonFilePhotoService PhotoService;
        public IEnumerable<Photo> Photos;
        public JsonFileProductService ProductService;
        public IEnumerable<Product> Products;


        public IndexModel(ILogger<IndexModel> logger, JsonFileProductService _productService, JsonFilePhotoService _photoService)
        {
            _logger = logger;
            PhotoService = _photoService;
            ProductService = _productService;
            
        }

        public void OnGet()
        {
            Photos = PhotoService.GetPhotos();
            Products = ProductService.GetProducts();
            
        }
    }
}

