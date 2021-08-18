using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.Json;
using RazorAndData.Models;
using Microsoft.AspNetCore.Hosting;
using System.Threading.Tasks;

namespace RazorAndData.Services
{
    public class JsonFilePhotoService
    {
        public JsonFilePhotoService(IWebHostEnvironment webHostEnvironment)
        {
            WebHostEnvironment = webHostEnvironment;
        }

        public IWebHostEnvironment WebHostEnvironment { get; }

        private string JsonFileName
        {
            get { return Path.Combine(WebHostEnvironment.WebRootPath, "data", "photos.json"); }
        }

        public IEnumerable<Photo> GetPhotos()
        {
            using (var jsonFileReader = File.OpenText(JsonFileName))
            {
                return JsonSerializer.Deserialize<Photo[]>(jsonFileReader.ReadToEnd(),
                    new JsonSerializerOptions
                    {
                        PropertyNameCaseInsensitive = true
                    });
            }
        }
    }
}
